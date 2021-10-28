package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaFunctionAssociation {

  def apply(
    eventType: Option[software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType] = None,
    lambdaFunction: Option[software.amazon.awscdk.services.lambda.IVersion] = None,
    includeBody: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation =
    (new software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation.Builder)
      .eventType(eventType.orNull)
      .lambdaFunction(lambdaFunction.orNull)
      .includeBody(includeBody.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
