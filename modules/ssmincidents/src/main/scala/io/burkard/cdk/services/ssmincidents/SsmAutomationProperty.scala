package io.burkard.cdk.services.ssmincidents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SsmAutomationProperty {

  def apply(
    documentVersion: Option[String] = None,
    documentName: Option[String] = None,
    roleArn: Option[String] = None,
    parameters: Option[List[_]] = None,
    targetAccount: Option[String] = None
  ): software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty =
    (new software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.SsmAutomationProperty.Builder)
      .documentVersion(documentVersion.orNull)
      .documentName(documentName.orNull)
      .roleArn(roleArn.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .targetAccount(targetAccount.orNull)
      .build()
}
