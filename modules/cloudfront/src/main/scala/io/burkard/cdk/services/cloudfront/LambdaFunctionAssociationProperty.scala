package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaFunctionAssociationProperty {

  def apply(
    eventType: Option[String] = None,
    lambdaFunctionArn: Option[String] = None,
    includeBody: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty.Builder)
      .eventType(eventType.orNull)
      .lambdaFunctionArn(lambdaFunctionArn.orNull)
      .includeBody(includeBody.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
