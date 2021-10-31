package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnNotebookInstanceLifecycleConfigProps {

  def apply(
    onCreate: Option[List[_]] = None,
    notebookInstanceLifecycleConfigName: Option[String] = None,
    onStart: Option[List[_]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps =
    (new software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfigProps.Builder)
      .onCreate(onCreate.map(_.asJava).orNull)
      .notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName.orNull)
      .onStart(onStart.map(_.asJava).orNull)
      .build()
}
