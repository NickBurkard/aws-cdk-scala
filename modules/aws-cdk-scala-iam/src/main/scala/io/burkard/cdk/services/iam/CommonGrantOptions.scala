package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CommonGrantOptions {

  def apply(
    resourceArns: Option[List[String]] = None,
    grantee: Option[software.amazon.awscdk.services.iam.IGrantable] = None,
    actions: Option[List[String]] = None
  ): software.amazon.awscdk.services.iam.CommonGrantOptions =
    (new software.amazon.awscdk.services.iam.CommonGrantOptions.Builder)
      .resourceArns(resourceArns.map(_.asJava).orNull)
      .grantee(grantee.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
