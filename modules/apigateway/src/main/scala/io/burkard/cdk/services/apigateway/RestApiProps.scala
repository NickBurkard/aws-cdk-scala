package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RestApiProps {

  def apply(
    apiKeySourceType: Option[software.amazon.awscdk.services.apigateway.ApiKeySourceType] = None,
    description: Option[String] = None,
    endpointExportName: Option[String] = None,
    binaryMediaTypes: Option[List[String]] = None,
    cloudWatchRole: Option[Boolean] = None,
    deployOptions: Option[software.amazon.awscdk.services.apigateway.StageOptions] = None,
    cloneFrom: Option[software.amazon.awscdk.services.apigateway.IRestApi] = None,
    defaultCorsPreflightOptions: Option[software.amazon.awscdk.services.apigateway.CorsOptions] = None,
    retainDeployments: Option[Boolean] = None,
    disableExecuteApiEndpoint: Option[Boolean] = None,
    endpointConfiguration: Option[software.amazon.awscdk.services.apigateway.EndpointConfiguration] = None,
    restApiName: Option[String] = None,
    endpointTypes: Option[List[_ <: software.amazon.awscdk.services.apigateway.EndpointType]] = None,
    minimumCompressionSize: Option[Number] = None,
    domainName: Option[software.amazon.awscdk.services.apigateway.DomainNameOptions] = None,
    failOnWarnings: Option[Boolean] = None,
    deploy: Option[Boolean] = None,
    defaultMethodOptions: Option[software.amazon.awscdk.services.apigateway.MethodOptions] = None,
    parameters: Option[Map[String, String]] = None,
    policy: Option[software.amazon.awscdk.services.iam.PolicyDocument] = None,
    defaultIntegration: Option[software.amazon.awscdk.services.apigateway.Integration] = None
  ): software.amazon.awscdk.services.apigateway.RestApiProps =
    (new software.amazon.awscdk.services.apigateway.RestApiProps.Builder)
      .apiKeySourceType(apiKeySourceType.orNull)
      .description(description.orNull)
      .endpointExportName(endpointExportName.orNull)
      .binaryMediaTypes(binaryMediaTypes.map(_.asJava).orNull)
      .cloudWatchRole(cloudWatchRole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deployOptions(deployOptions.orNull)
      .cloneFrom(cloneFrom.orNull)
      .defaultCorsPreflightOptions(defaultCorsPreflightOptions.orNull)
      .retainDeployments(retainDeployments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .disableExecuteApiEndpoint(disableExecuteApiEndpoint.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .endpointConfiguration(endpointConfiguration.orNull)
      .restApiName(restApiName.orNull)
      .endpointTypes(endpointTypes.map(_.asJava).orNull)
      .minimumCompressionSize(minimumCompressionSize.orNull)
      .domainName(domainName.orNull)
      .failOnWarnings(failOnWarnings.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deploy(deploy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultMethodOptions(defaultMethodOptions.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .policy(policy.orNull)
      .defaultIntegration(defaultIntegration.orNull)
      .build()
}
