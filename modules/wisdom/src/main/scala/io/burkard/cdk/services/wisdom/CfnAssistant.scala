package io.burkard.cdk.services.wisdom

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAssistant {

  def apply(
    internalResourceId: String,
    name: String,
    `type`: String,
    serverSideEncryptionConfiguration: Option[software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.wisdom.CfnAssistant =
    software.amazon.awscdk.services.wisdom.CfnAssistant.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .`type`(`type`)
      .serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
