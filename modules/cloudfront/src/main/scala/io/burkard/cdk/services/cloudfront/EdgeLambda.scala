package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EdgeLambda {

  def apply(
    eventType: software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType,
    functionVersion: software.amazon.awscdk.services.lambda.IVersion,
    includeBody: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.EdgeLambda =
    (new software.amazon.awscdk.services.cloudfront.EdgeLambda.Builder)
      .eventType(eventType)
      .functionVersion(functionVersion)
      .includeBody(includeBody.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
