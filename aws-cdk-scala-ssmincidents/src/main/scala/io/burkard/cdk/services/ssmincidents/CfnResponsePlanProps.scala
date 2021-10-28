package io.burkard.cdk.services.ssmincidents

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResponsePlanProps {

  def apply(
    displayName: Option[String] = None,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    chatChannel: Option[software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.ChatChannelProperty] = None,
    incidentTemplate: Option[software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.IncidentTemplateProperty] = None,
    engagements: Option[List[String]] = None,
    actions: Option[List[_]] = None
  ): software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps =
    (new software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps.Builder)
      .displayName(displayName.orNull)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .chatChannel(chatChannel.orNull)
      .incidentTemplate(incidentTemplate.orNull)
      .engagements(engagements.map(_.asJava).orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
