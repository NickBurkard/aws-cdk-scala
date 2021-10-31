package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionAssociationProperty {

  def apply(
    eventType: Option[String] = None,
    functionArn: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.FunctionAssociationProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.FunctionAssociationProperty.Builder)
      .eventType(eventType.orNull)
      .functionArn(functionArn.orNull)
      .build()
}
