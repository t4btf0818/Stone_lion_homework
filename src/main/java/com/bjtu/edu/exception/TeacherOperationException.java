package com.bjtu.edu.exception;

/**
 * @project: HMS-mvc
 * @description: Teacher操作异常类
 */
public class TeacherOperationException extends RuntimeException{
    private static final long serialVersionUID = -5542113967321598807L;

    public TeacherOperationException(String msg){super(msg);}
}
