package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TokenAuthorizer {

  def apply(
    internalResourceId: String,
    assumeRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    validationRegex: Option[String] = None,
    identitySource: Option[String] = None,
    authorizerName: Option[String] = None,
    resultsCacheTtl: Option[software.amazon.awscdk.Duration] = None,
    handler: Option[software.amazon.awscdk.services.lambda.IFunction] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.TokenAuthorizer =
    software.amazon.awscdk.services.apigateway.TokenAuthorizer.Builder
      .create(stackCtx, internalResourceId)
      .assumeRole(assumeRole.orNull)
      .validationRegex(validationRegex.orNull)
      .identitySource(identitySource.orNull)
      .authorizerName(authorizerName.orNull)
      .resultsCacheTtl(resultsCacheTtl.orNull)
      .handler(handler.orNull)
      .build()
}
