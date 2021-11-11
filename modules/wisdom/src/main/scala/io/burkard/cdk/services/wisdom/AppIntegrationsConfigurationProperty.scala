package io.burkard.cdk.services.wisdom

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AppIntegrationsConfigurationProperty {

  def apply(
    objectFields: Option[List[String]] = None,
    appIntegrationArn: Option[String] = None
  ): software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty =
    (new software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty.Builder)
      .objectFields(objectFields.map(_.asJava).orNull)
      .appIntegrationArn(appIntegrationArn.orNull)
      .build()
}
