package io.burkard.cdk.services.ssm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TargetProperty {

  def apply(
    key: Option[String] = None,
    values: Option[List[String]] = None
  ): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TargetProperty =
    (new software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TargetProperty.Builder)
      .key(key.orNull)
      .values(values.map(_.asJava).orNull)
      .build()
}
