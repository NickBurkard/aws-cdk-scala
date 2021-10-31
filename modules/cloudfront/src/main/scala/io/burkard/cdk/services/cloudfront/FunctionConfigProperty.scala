package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionConfigProperty {

  def apply(
    comment: Option[String] = None,
    runtime: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty.Builder)
      .comment(comment.orNull)
      .runtime(runtime.orNull)
      .build()
}
