package io.burkard.cdk.services.wisdom

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAssistantProps {

  def apply(
    name: Option[String] = None,
    `type`: Option[String] = None,
    serverSideEncryptionConfiguration: Option[software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.wisdom.CfnAssistantProps =
    (new software.amazon.awscdk.services.wisdom.CfnAssistantProps.Builder)
      .name(name.orNull)
      .`type`(`type`.orNull)
      .serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
