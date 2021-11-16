package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaFunctionAssociation {

  def apply(
    eventType: software.amazon.awscdk.services.cloudfront.LambdaEdgeEventType,
    lambdaFunction: software.amazon.awscdk.services.lambda.IVersion,
    includeBody: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation =
    (new software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation.Builder)
      .eventType(eventType)
      .lambdaFunction(lambdaFunction)
      .includeBody(includeBody.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
