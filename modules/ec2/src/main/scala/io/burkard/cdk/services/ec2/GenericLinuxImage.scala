package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GenericLinuxImage {

  def apply(
    amiMap: Map[String, String],
    userData: Option[software.amazon.awscdk.services.ec2.UserData] = None
  ): software.amazon.awscdk.services.ec2.GenericLinuxImage =
    software.amazon.awscdk.services.ec2.GenericLinuxImage.Builder
      .create(amiMap.asJava)
      .userData(userData.orNull)
      .build()
}
