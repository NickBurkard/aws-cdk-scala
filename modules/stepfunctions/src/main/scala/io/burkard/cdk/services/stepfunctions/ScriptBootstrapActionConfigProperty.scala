package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScriptBootstrapActionConfigProperty {

  def apply(
    path: Option[String] = None,
    args: Option[List[String]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScriptBootstrapActionConfigProperty.Builder)
      .path(path.orNull)
      .args(args.map(_.asJava).orNull)
      .build()
}
