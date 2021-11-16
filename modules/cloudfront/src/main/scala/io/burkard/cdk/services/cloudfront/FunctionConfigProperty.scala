package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionConfigProperty {

  def apply(
    comment: String,
    runtime: String
  ): software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty.Builder)
      .comment(comment)
      .runtime(runtime)
      .build()
}
