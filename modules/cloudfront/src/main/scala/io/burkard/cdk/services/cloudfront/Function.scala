package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Function {

  def apply(
    internalResourceId: String,
    code: software.amazon.awscdk.services.cloudfront.FunctionCode,
    functionName: Option[String] = None,
    comment: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.Function =
    software.amazon.awscdk.services.cloudfront.Function.Builder
      .create(stackCtx, internalResourceId)
      .code(code)
      .functionName(functionName.orNull)
      .comment(comment.orNull)
      .build()
}
