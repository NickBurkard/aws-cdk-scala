package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PushSyncProperty {

  def apply(
    applicationArns: Option[List[String]] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty =
    (new software.amazon.awscdk.services.cognito.CfnIdentityPool.PushSyncProperty.Builder)
      .applicationArns(applicationArns.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .build()
}
