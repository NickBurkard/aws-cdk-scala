package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetsProperty {

  def apply(
    key: Option[String] = None,
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.TargetsProperty =
    (new software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTarget.TargetsProperty.Builder)
      .key(key.orNull)
      .values(values.map(_.asJava).orNull)
      .build()
}
