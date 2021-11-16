package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionProps {

  def apply(
    code: software.amazon.awscdk.services.cloudfront.FunctionCode,
    functionName: Option[String] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.FunctionProps =
    (new software.amazon.awscdk.services.cloudfront.FunctionProps.Builder)
      .code(code)
      .functionName(functionName.orNull)
      .comment(comment.orNull)
      .build()
}
