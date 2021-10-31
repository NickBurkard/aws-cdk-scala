package io.burkard.cdk.services.elasticsearch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDomainProps {

  def apply(
    logPublishingOptions: Option[Map[String, _]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domainName: Option[String] = None,
    nodeToNodeEncryptionOptions: Option[software.amazon.awscdk.services.elasticsearch.CfnDomain.NodeToNodeEncryptionOptionsProperty] = None,
    ebsOptions: Option[software.amazon.awscdk.services.elasticsearch.CfnDomain.EBSOptionsProperty] = None,
    domainEndpointOptions: Option[software.amazon.awscdk.services.elasticsearch.CfnDomain.DomainEndpointOptionsProperty] = None,
    accessPolicies: Option[AnyRef] = None,
    snapshotOptions: Option[software.amazon.awscdk.services.elasticsearch.CfnDomain.SnapshotOptionsProperty] = None,
    advancedOptions: Option[Map[String, String]] = None,
    cognitoOptions: Option[software.amazon.awscdk.services.elasticsearch.CfnDomain.CognitoOptionsProperty] = None,
    vpcOptions: Option[software.amazon.awscdk.services.elasticsearch.CfnDomain.VPCOptionsProperty] = None,
    advancedSecurityOptions: Option[software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty] = None,
    encryptionAtRestOptions: Option[software.amazon.awscdk.services.elasticsearch.CfnDomain.EncryptionAtRestOptionsProperty] = None,
    elasticsearchClusterConfig: Option[software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty] = None,
    elasticsearchVersion: Option[String] = None
  ): software.amazon.awscdk.services.elasticsearch.CfnDomainProps =
    (new software.amazon.awscdk.services.elasticsearch.CfnDomainProps.Builder)
      .logPublishingOptions(logPublishingOptions.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .domainName(domainName.orNull)
      .nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions.orNull)
      .ebsOptions(ebsOptions.orNull)
      .domainEndpointOptions(domainEndpointOptions.orNull)
      .accessPolicies(accessPolicies.orNull)
      .snapshotOptions(snapshotOptions.orNull)
      .advancedOptions(advancedOptions.map(_.asJava).orNull)
      .cognitoOptions(cognitoOptions.orNull)
      .vpcOptions(vpcOptions.orNull)
      .advancedSecurityOptions(advancedSecurityOptions.orNull)
      .encryptionAtRestOptions(encryptionAtRestOptions.orNull)
      .elasticsearchClusterConfig(elasticsearchClusterConfig.orNull)
      .elasticsearchVersion(elasticsearchVersion.orNull)
      .build()
}
