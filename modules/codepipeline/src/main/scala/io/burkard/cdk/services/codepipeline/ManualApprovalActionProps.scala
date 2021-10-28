package io.burkard.cdk.services.codepipeline

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ManualApprovalActionProps {

  def apply(
    notificationTopic: Option[software.amazon.awscdk.services.sns.ITopic] = None,
    additionalInformation: Option[String] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    notifyEmails: Option[List[String]] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    externalEntityLink: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.ManualApprovalActionProps.Builder)
      .notificationTopic(notificationTopic.orNull)
      .additionalInformation(additionalInformation.orNull)
      .role(role.orNull)
      .notifyEmails(notifyEmails.map(_.asJava).orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .externalEntityLink(externalEntityLink.orNull)
      .build()
}
