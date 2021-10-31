package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OnPremConfigProperty {

  def apply(
    agentArns: Option[List[String]] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty =
    (new software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty.Builder)
      .agentArns(agentArns.map(_.asJava).orNull)
      .build()
}
