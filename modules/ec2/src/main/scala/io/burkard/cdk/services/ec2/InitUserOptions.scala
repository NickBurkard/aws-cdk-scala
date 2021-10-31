package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InitUserOptions {

  def apply(
    groups: Option[List[String]] = None,
    homeDir: Option[String] = None,
    userId: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.InitUserOptions =
    (new software.amazon.awscdk.services.ec2.InitUserOptions.Builder)
      .groups(groups.map(_.asJava).orNull)
      .homeDir(homeDir.orNull)
      .userId(userId.orNull)
      .build()
}
