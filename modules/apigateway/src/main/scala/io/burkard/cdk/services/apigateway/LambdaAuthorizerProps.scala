package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaAuthorizerProps {

  def apply(
    handler: software.amazon.awscdk.services.lambda.IFunction,
    assumeRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    authorizerName: Option[String] = None,
    resultsCacheTtl: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps =
    (new software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps.Builder)
      .handler(handler)
      .assumeRole(assumeRole.orNull)
      .authorizerName(authorizerName.orNull)
      .resultsCacheTtl(resultsCacheTtl.orNull)
      .build()
}
