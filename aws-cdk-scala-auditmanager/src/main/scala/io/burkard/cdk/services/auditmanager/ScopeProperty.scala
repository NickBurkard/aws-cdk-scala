package io.burkard.cdk.services.auditmanager

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScopeProperty {

  def apply(
    awsAccounts: Option[List[_]] = None,
    awsServices: Option[List[_]] = None
  ): software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty =
    (new software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty.Builder)
      .awsAccounts(awsAccounts.map(_.asJava).orNull)
      .awsServices(awsServices.map(_.asJava).orNull)
      .build()
}
