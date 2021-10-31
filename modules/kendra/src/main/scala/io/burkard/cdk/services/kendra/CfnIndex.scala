package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnIndex {

  def apply(
    internalResourceId: String,
    userTokenConfigurations: Option[List[_]] = None,
    name: Option[String] = None,
    documentMetadataConfigurations: Option[List[_]] = None,
    edition: Option[String] = None,
    capacityUnits: Option[software.amazon.awscdk.services.kendra.CfnIndex.CapacityUnitsConfigurationProperty] = None,
    roleArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    serverSideEncryptionConfiguration: Option[software.amazon.awscdk.services.kendra.CfnIndex.ServerSideEncryptionConfigurationProperty] = None,
    userContextPolicy: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kendra.CfnIndex =
    software.amazon.awscdk.services.kendra.CfnIndex.Builder
      .create(stackCtx, internalResourceId)
      .userTokenConfigurations(userTokenConfigurations.map(_.asJava).orNull)
      .name(name.orNull)
      .documentMetadataConfigurations(documentMetadataConfigurations.map(_.asJava).orNull)
      .edition(edition.orNull)
      .capacityUnits(capacityUnits.orNull)
      .roleArn(roleArn.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.orNull)
      .userContextPolicy(userContextPolicy.orNull)
      .build()
}
