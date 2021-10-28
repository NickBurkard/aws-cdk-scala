package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RestApiBaseProps {

  def apply(
    endpointExportName: Option[String] = None,
    cloudWatchRole: Option[Boolean] = None,
    deployOptions: Option[software.amazon.awscdk.services.apigateway.StageOptions] = None,
    retainDeployments: Option[Boolean] = None,
    disableExecuteApiEndpoint: Option[Boolean] = None,
    deploy: Option[Boolean] = None,
    restApiName: Option[String] = None,
    endpointTypes: Option[List[_ <: software.amazon.awscdk.services.apigateway.EndpointType]] = None,
    domainName: Option[software.amazon.awscdk.services.apigateway.DomainNameOptions] = None,
    failOnWarnings: Option[Boolean] = None,
    parameters: Option[Map[String, String]] = None,
    policy: Option[software.amazon.awscdk.services.iam.PolicyDocument] = None
  ): software.amazon.awscdk.services.apigateway.RestApiBaseProps =
    (new software.amazon.awscdk.services.apigateway.RestApiBaseProps.Builder)
      .endpointExportName(endpointExportName.orNull)
      .cloudWatchRole(cloudWatchRole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deployOptions(deployOptions.orNull)
      .retainDeployments(retainDeployments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .disableExecuteApiEndpoint(disableExecuteApiEndpoint.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deploy(deploy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .restApiName(restApiName.orNull)
      .endpointTypes(endpointTypes.map(_.asJava).orNull)
      .domainName(domainName.orNull)
      .failOnWarnings(failOnWarnings.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .parameters(parameters.map(_.asJava).orNull)
      .policy(policy.orNull)
      .build()
}
