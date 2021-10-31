package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Function {

  def apply(
    internalResourceId: String,
    functionName: Option[String] = None,
    code: Option[software.amazon.awscdk.services.cloudfront.FunctionCode] = None,
    comment: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.Function =
    software.amazon.awscdk.services.cloudfront.Function.Builder
      .create(stackCtx, internalResourceId)
      .functionName(functionName.orNull)
      .code(code.orNull)
      .comment(comment.orNull)
      .build()
}
