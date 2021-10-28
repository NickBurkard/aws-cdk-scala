package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaAuthorizerProps {

  def apply(
    assumeRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    authorizerName: Option[String] = None,
    resultsCacheTtl: Option[software.amazon.awscdk.Duration] = None,
    handler: Option[software.amazon.awscdk.services.lambda.IFunction] = None
  ): software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps =
    (new software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps.Builder)
      .assumeRole(assumeRole.orNull)
      .authorizerName(authorizerName.orNull)
      .resultsCacheTtl(resultsCacheTtl.orNull)
      .handler(handler.orNull)
      .build()
}
