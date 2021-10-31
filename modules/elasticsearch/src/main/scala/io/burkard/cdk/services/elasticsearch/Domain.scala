package io.burkard.cdk.services.elasticsearch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Domain {

  def apply(
    internalResourceId: String,
    tlsSecurityPolicy: Option[software.amazon.awscdk.services.elasticsearch.TLSSecurityPolicy] = None,
    useUnsignedBasicAuth: Option[Boolean] = None,
    nodeToNodeEncryption: Option[Boolean] = None,
    domainName: Option[String] = None,
    vpcSubnets: Option[List[_ <: software.amazon.awscdk.services.ec2.SubnetSelection]] = None,
    version: Option[software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion] = None,
    fineGrainedAccessControl: Option[software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions] = None,
    accessPolicies: Option[List[_ <: software.amazon.awscdk.services.iam.PolicyStatement]] = None,
    enableVersionUpgrade: Option[Boolean] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    enforceHttps: Option[Boolean] = None,
    encryptionAtRest: Option[software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions] = None,
    advancedOptions: Option[Map[String, String]] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    capacity: Option[software.amazon.awscdk.services.elasticsearch.CapacityConfig] = None,
    zoneAwareness: Option[software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig] = None,
    logging: Option[software.amazon.awscdk.services.elasticsearch.LoggingOptions] = None,
    customEndpoint: Option[software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions] = None,
    cognitoKibanaAuth: Option[software.amazon.awscdk.services.elasticsearch.CognitoOptions] = None,
    automatedSnapshotStartHour: Option[Number] = None,
    ebs: Option[software.amazon.awscdk.services.elasticsearch.EbsOptions] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticsearch.Domain =
    software.amazon.awscdk.services.elasticsearch.Domain.Builder
      .create(stackCtx, internalResourceId)
      .tlsSecurityPolicy(tlsSecurityPolicy.orNull)
      .useUnsignedBasicAuth(useUnsignedBasicAuth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .nodeToNodeEncryption(nodeToNodeEncryption.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .domainName(domainName.orNull)
      .vpcSubnets(vpcSubnets.map(_.asJava).orNull)
      .version(version.orNull)
      .fineGrainedAccessControl(fineGrainedAccessControl.orNull)
      .accessPolicies(accessPolicies.map(_.asJava).orNull)
      .enableVersionUpgrade(enableVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .enforceHttps(enforceHttps.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .encryptionAtRest(encryptionAtRest.orNull)
      .advancedOptions(advancedOptions.map(_.asJava).orNull)
      .removalPolicy(removalPolicy.orNull)
      .capacity(capacity.orNull)
      .zoneAwareness(zoneAwareness.orNull)
      .logging(logging.orNull)
      .customEndpoint(customEndpoint.orNull)
      .cognitoKibanaAuth(cognitoKibanaAuth.orNull)
      .automatedSnapshotStartHour(automatedSnapshotStartHour.orNull)
      .ebs(ebs.orNull)
      .build()
}
