package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LookupMachineImage {

  def apply(
    name: Option[String] = None,
    userData: Option[software.amazon.awscdk.services.ec2.UserData] = None,
    owners: Option[List[String]] = None,
    filters: Option[Map[String, _ <: List[String]]] = None,
    windows: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.LookupMachineImage =
    software.amazon.awscdk.services.ec2.LookupMachineImage.Builder
      .create()
      .name(name.orNull)
      .userData(userData.orNull)
      .owners(owners.map(_.asJava).orNull)
      .filters(filters.map(_.mapValues(_.asJava).toMap.asJava).orNull)
      .windows(windows.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
