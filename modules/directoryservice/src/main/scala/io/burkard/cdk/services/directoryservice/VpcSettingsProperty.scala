package io.burkard.cdk.services.directoryservice

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcSettingsProperty {

  def apply(
    subnetIds: Option[List[String]] = None,
    vpcId: Option[String] = None
  ): software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty =
    (new software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .vpcId(vpcId.orNull)
      .build()
}
