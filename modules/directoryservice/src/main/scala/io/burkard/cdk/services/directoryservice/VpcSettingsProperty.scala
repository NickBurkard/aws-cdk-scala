package io.burkard.cdk.services.directoryservice

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcSettingsProperty {

  def apply(
    subnetIds: List[String],
    vpcId: String
  ): software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty =
    (new software.amazon.awscdk.services.directoryservice.CfnSimpleAD.VpcSettingsProperty.Builder)
      .subnetIds(subnetIds.asJava)
      .vpcId(vpcId)
      .build()
}
