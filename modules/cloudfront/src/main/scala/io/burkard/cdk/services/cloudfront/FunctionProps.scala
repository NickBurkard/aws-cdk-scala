package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionProps {

  def apply(
    functionName: Option[String] = None,
    code: Option[software.amazon.awscdk.services.cloudfront.FunctionCode] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.FunctionProps =
    (new software.amazon.awscdk.services.cloudfront.FunctionProps.Builder)
      .functionName(functionName.orNull)
      .code(code.orNull)
      .comment(comment.orNull)
      .build()
}
