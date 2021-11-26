package io.burkard.cdk

import software.amazon.awscdk.{App, AppProps}
import software.amazon.awscdk.cxapi.CloudAssembly

/**
 * CDK application, can have one or more stacks.
 * @param props Optional app properties.
 */
abstract class CdkApp(props: Option[AppProps] = None)
  extends App(props.orNull) {

  // Context for initializing one or more stacks.
  protected[this] implicit lazy val appCtx: App = this

  def main(args: Array[String]): Unit =
    run()

  // Supposedly always needed due to this jsii issue:
  // https://github.com/aws/jsii/issues/456
  protected[this] final def run(): Unit =
    ValueDiscard[CloudAssembly](synth())
}
