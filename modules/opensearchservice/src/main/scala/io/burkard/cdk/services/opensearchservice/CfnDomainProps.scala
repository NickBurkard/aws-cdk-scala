package io.burkard.cdk.services.opensearchservice

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDomainProps {

  def apply(
    logPublishingOptions: Option[Map[String, _]] = None,
    clusterConfig: Option[software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domainName: Option[String] = None,
    nodeToNodeEncryptionOptions: Option[software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty] = None,
    ebsOptions: Option[software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty] = None,
    domainEndpointOptions: Option[software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty] = None,
    accessPolicies: Option[AnyRef] = None,
    snapshotOptions: Option[software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty] = None,
    cognitoOptions: Option[software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty] = None,
    vpcOptions: Option[software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty] = None,
    advancedSecurityOptions: Option[software.amazon.awscdk.services.opensearchservice.CfnDomain.AdvancedSecurityOptionsInputProperty] = None,
    encryptionAtRestOptions: Option[software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty] = None,
    advancedOptions: Option[Map[String, String]] = None,
    engineVersion: Option[String] = None
  ): software.amazon.awscdk.services.opensearchservice.CfnDomainProps =
    (new software.amazon.awscdk.services.opensearchservice.CfnDomainProps.Builder)
      .logPublishingOptions(logPublishingOptions.map(_.asJava).orNull)
      .clusterConfig(clusterConfig.orNull)
      .tags(tags.map(_.asJava).orNull)
      .domainName(domainName.orNull)
      .nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions.orNull)
      .ebsOptions(ebsOptions.orNull)
      .domainEndpointOptions(domainEndpointOptions.orNull)
      .accessPolicies(accessPolicies.orNull)
      .snapshotOptions(snapshotOptions.orNull)
      .cognitoOptions(cognitoOptions.orNull)
      .vpcOptions(vpcOptions.orNull)
      .advancedSecurityOptions(advancedSecurityOptions.orNull)
      .encryptionAtRestOptions(encryptionAtRestOptions.orNull)
      .advancedOptions(advancedOptions.map(_.asJava).orNull)
      .engineVersion(engineVersion.orNull)
      .build()
}
