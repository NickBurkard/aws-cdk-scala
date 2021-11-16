package io.burkard.cdk.services.wisdom

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AppIntegrationsConfigurationProperty {

  def apply(
    objectFields: List[String],
    appIntegrationArn: String
  ): software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty =
    (new software.amazon.awscdk.services.wisdom.CfnKnowledgeBase.AppIntegrationsConfigurationProperty.Builder)
      .objectFields(objectFields.asJava)
      .appIntegrationArn(appIntegrationArn)
      .build()
}
