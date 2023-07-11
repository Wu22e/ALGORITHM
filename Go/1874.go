package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func Solve1874() {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	n, _ := strconv.Atoi(scanner.Text())

	stack := &Stack{}
	s := make([]string, 0)
	next := 1

	for i := 0; i < n; i++ {
		scanner.Scan()
		inputNum, _ := strconv.Atoi(scanner.Text())

		for inputNum >= next {
			stack.Push(next)
			next++
			s = append(s, "+")
		}

		if stack.Top() == inputNum {
			stack.Pop()
			s = append(s, "-")
		} else if stack.Top() > inputNum {
			fmt.Println("NO")
			return
		}
	}

	if !stack.IsEmpty() {
		fmt.Println("NO")
		return
	}

	fmt.Println(strings.Join(s, "\n"))
}

// slice stack
type Stack struct {
	items []int
}

func (s *Stack) Push(v int) {
	s.items = append(s.items, v)
}

func (s *Stack) Pop() int {
	l := len(s.items)
	item := s.items[l-1]
	s.items = s.items[:l-1]
	return item
}

func (s *Stack) Top() int {
	l := len(s.items)
	if l == 0 {
		return -1
	}
	return s.items[l-1]
}

func (s *Stack) IsEmpty() bool {
	return len(s.items) == 0
}
