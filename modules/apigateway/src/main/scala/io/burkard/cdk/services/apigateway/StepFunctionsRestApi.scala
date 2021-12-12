package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StepFunctionsRestApi {

  def apply(
    internalResourceId: String,
    stateMachine: software.amazon.awscdk.services.stepfunctions.IStateMachine,
    path: Option[Boolean] = None,
    apiKeySourceType: Option[software.amazon.awscdk.services.apigateway.ApiKeySourceType] = None,
    description: Option[String] = None,
    endpointExportName: Option[String] = None,
    binaryMediaTypes: Option[List[String]] = None,
    cloudWatchRole: Option[Boolean] = None,
    deployOptions: Option[software.amazon.awscdk.services.apigateway.StageOptions] = None,
    cloneFrom: Option[software.amazon.awscdk.services.apigateway.IRestApi] = None,
    retainDeployments: Option[Boolean] = None,
    disableExecuteApiEndpoint: Option[Boolean] = None,
    endpointConfiguration: Option[software.amazon.awscdk.services.apigateway.EndpointConfiguration] = None,
    requestContext: Option[software.amazon.awscdk.services.apigateway.RequestContext] = None,
    endpointTypes: Option[List[_ <: software.amazon.awscdk.services.apigateway.EndpointType]] = None,
    domainName: Option[software.amazon.awscdk.services.apigateway.DomainNameOptions] = None,
    failOnWarnings: Option[Boolean] = None,
    defaultCorsPreflightOptions: Option[software.amazon.awscdk.services.apigateway.CorsOptions] = None,
    deploy: Option[Boolean] = None,
    defaultMethodOptions: Option[software.amazon.awscdk.services.apigateway.MethodOptions] = None,
    restApiName: Option[String] = None,
    headers: Option[Boolean] = None,
    parameters: Option[Map[String, String]] = None,
    policy: Option[software.amazon.awscdk.services.iam.PolicyDocument] = None,
    defaultIntegration: Option[software.amazon.awscdk.services.apigateway.Integration] = None,
    querystring: Option[Boolean] = None,
    minimumCompressionSize: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.StepFunctionsRestApi =
    software.amazon.awscdk.services.apigateway.StepFunctionsRestApi.Builder
      .create(stackCtx, internalResourceId)
      .stateMachine(stateMachine)
      .path(path.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .apiKeySourceType(apiKeySourceType.orNull)
      .description(description.orNull)
      .endpointExportName(endpointExportName.orNull)
      .binaryMediaTypes(binaryMediaTypes.map(_.asJava).orNull)
      .cloudWatchRole(cloudWatchRole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deployOptions(deployOptions.orNull)
      .cloneFrom(cloneFrom.orNull)
      .retainDeployments(retainDeployments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .disableExecuteApiEndpoint(disableExecuteApiEndpoint.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .endpointConfiguration(endpointConfiguration.orNull)
      .requestContext(requestContext.orNull)
      .endpointTypes(endpointTypes.map(_.asJava).orNull)
      .domainName(domainName.orNull)
      .failOnWarnings(failOnWarnings.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultCorsPreflightOptions(defaultCorsPreflightOptions.orNull)
      .deploy(deploy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultMethodOptions(defaultMethodOptions.orNull)
      .restApiName(restApiName.orNull)
      .headers(headers.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .parameters(parameters.map(_.asJava).orNull)
      .policy(policy.orNull)
      .defaultIntegration(defaultIntegration.orNull)
      .querystring(querystring.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .minimumCompressionSize(minimumCompressionSize.orNull)
      .build()
}
