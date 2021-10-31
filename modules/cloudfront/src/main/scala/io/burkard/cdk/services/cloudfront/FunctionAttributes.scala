package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionAttributes {

  def apply(
    functionName: Option[String] = None,
    functionArn: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.FunctionAttributes =
    (new software.amazon.awscdk.services.cloudfront.FunctionAttributes.Builder)
      .functionName(functionName.orNull)
      .functionArn(functionArn.orNull)
      .build()
}
