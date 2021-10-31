package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TokenAuthorizerProps {

  def apply(
    assumeRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    validationRegex: Option[String] = None,
    identitySource: Option[String] = None,
    authorizerName: Option[String] = None,
    resultsCacheTtl: Option[software.amazon.awscdk.Duration] = None,
    handler: Option[software.amazon.awscdk.services.lambda.IFunction] = None
  ): software.amazon.awscdk.services.apigateway.TokenAuthorizerProps =
    (new software.amazon.awscdk.services.apigateway.TokenAuthorizerProps.Builder)
      .assumeRole(assumeRole.orNull)
      .validationRegex(validationRegex.orNull)
      .identitySource(identitySource.orNull)
      .authorizerName(authorizerName.orNull)
      .resultsCacheTtl(resultsCacheTtl.orNull)
      .handler(handler.orNull)
      .build()
}
