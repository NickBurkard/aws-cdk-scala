package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIndexProps {

  def apply(
    name: String,
    edition: String,
    roleArn: String,
    userTokenConfigurations: Option[List[_]] = None,
    documentMetadataConfigurations: Option[List[_]] = None,
    capacityUnits: Option[software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    serverSideEncryptionConfiguration: Option[software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty] = None,
    userContextPolicy: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnIndexProps =
    (new software.amazon.awscdk.services.kendra.CfnIndexProps.Builder)
      .name(name)
      .edition(edition)
      .roleArn(roleArn)
      .userTokenConfigurations(userTokenConfigurations.map(_.asJava).orNull)
      .documentMetadataConfigurations(documentMetadataConfigurations.map(_.asJava).orNull)
      .capacityUnits(capacityUnits.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.orNull)
      .userContextPolicy(userContextPolicy.orNull)
      .build()
}
