package io.burkard.cdk.services.appintegrations

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventIntegrationAssociationProperty {

  def apply(
    eventIntegrationAssociationId: Option[String] = None,
    clientAssociationMetadata: Option[List[_]] = None,
    eventBridgeRuleName: Option[String] = None,
    eventIntegrationAssociationArn: Option[String] = None,
    clientId: Option[String] = None
  ): software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventIntegrationAssociationProperty =
    (new software.amazon.awscdk.services.appintegrations.CfnEventIntegration.EventIntegrationAssociationProperty.Builder)
      .eventIntegrationAssociationId(eventIntegrationAssociationId.orNull)
      .clientAssociationMetadata(clientAssociationMetadata.map(_.asJava).orNull)
      .eventBridgeRuleName(eventBridgeRuleName.orNull)
      .eventIntegrationAssociationArn(eventIntegrationAssociationArn.orNull)
      .clientId(clientId.orNull)
      .build()
}
