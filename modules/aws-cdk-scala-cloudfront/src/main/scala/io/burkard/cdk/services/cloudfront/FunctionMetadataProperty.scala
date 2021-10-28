package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FunctionMetadataProperty {

  def apply(
    functionArn: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty.Builder)
      .functionArn(functionArn.orNull)
      .build()
}
