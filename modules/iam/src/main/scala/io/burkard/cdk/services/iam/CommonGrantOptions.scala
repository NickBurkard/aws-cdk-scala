package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CommonGrantOptions {

  def apply(
    resourceArns: List[String],
    grantee: software.amazon.awscdk.services.iam.IGrantable,
    actions: List[String]
  ): software.amazon.awscdk.services.iam.CommonGrantOptions =
    (new software.amazon.awscdk.services.iam.CommonGrantOptions.Builder)
      .resourceArns(resourceArns.asJava)
      .grantee(grantee)
      .actions(actions.asJava)
      .build()
}
