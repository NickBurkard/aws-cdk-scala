package io.burkard.cdk.services.cloudformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeploymentTargetsProperty {

  def apply(
    organizationalUnitIds: Option[List[String]] = None,
    accounts: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudformation.CfnStackSet.DeploymentTargetsProperty =
    (new software.amazon.awscdk.services.cloudformation.CfnStackSet.DeploymentTargetsProperty.Builder)
      .organizationalUnitIds(organizationalUnitIds.map(_.asJava).orNull)
      .accounts(accounts.map(_.asJava).orNull)
      .build()
}
