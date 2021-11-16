package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OnPremConfigProperty {

  def apply(
    agentArns: List[String]
  ): software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty =
    (new software.amazon.awscdk.services.datasync.CfnLocationNFS.OnPremConfigProperty.Builder)
      .agentArns(agentArns.asJava)
      .build()
}
