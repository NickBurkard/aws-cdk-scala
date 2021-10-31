package io.burkard.cdk.services.dlm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ActionProperty {

  def apply(
    name: Option[String] = None,
    crossRegionCopy: Option[List[_]] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty.Builder)
      .name(name.orNull)
      .crossRegionCopy(crossRegionCopy.map(_.asJava).orNull)
      .build()
}
