package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EdgeLambda {

  def apply(
    eventType: Option[software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType] = None,
    functionVersion: Option[software.amazon.awscdk.services.lambda.IVersion] = None,
    includeBody: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.EdgeLambda =
    (new software.amazon.awscdk.services.cloudfront.EdgeLambda.Builder)
      .eventType(eventType.orNull)
      .functionVersion(functionVersion.orNull)
      .includeBody(includeBody.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
