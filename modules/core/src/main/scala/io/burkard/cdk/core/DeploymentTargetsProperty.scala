package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeploymentTargetsProperty {

  def apply(
    organizationalUnitIds: Option[List[String]] = None,
    accounts: Option[List[String]] = None
  ): software.amazon.awscdk.CfnStackSet.DeploymentTargetsProperty =
    (new software.amazon.awscdk.CfnStackSet.DeploymentTargetsProperty.Builder)
      .organizationalUnitIds(organizationalUnitIds.map(_.asJava).orNull)
      .accounts(accounts.map(_.asJava).orNull)
      .build()
}
